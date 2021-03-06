package org.ocpsoft.prettyfaces.annotation.handlers;

import org.ocpsoft.prettyfaces.annotation.Join;
import org.ocpsoft.rewrite.annotation.api.ClassContext;
import org.ocpsoft.rewrite.annotation.api.HandlerChain;
import org.ocpsoft.rewrite.annotation.spi.AnnotationHandler;

public class JoinHandler implements AnnotationHandler<Join>
{

   @Override
   public Class<Join> handles()
   {
      return Join.class;
   }

   @Override
   public int priority()
   {
      return HandlerConstants.WEIGHT_TYPE_STRUCTURAL;
   }

   @Override
   public void process(ClassContext context, Join annotation, HandlerChain chain)
   {
      context.setBaseRule(org.ocpsoft.rewrite.servlet.config.rule.Join
               .path(annotation.path())
               .to(annotation.to()));
      chain.proceed();
   }

}
