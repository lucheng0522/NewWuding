// Generated code from Butter Knife. Do not modify!
package com.i5d5.wuding.WD.View.Activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.i5d5.wuding.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ClassActivity_ViewBinding implements Unbinder {
  private ClassActivity target;

  private View view2131558522;

  @UiThread
  public ClassActivity_ViewBinding(ClassActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ClassActivity_ViewBinding(final ClassActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.button, "field 'button' and method 'onViewClicked'");
    target.button = Utils.castView(view, R.id.button, "field 'button'", Button.class);
    view2131558522 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    ClassActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.button = null;

    view2131558522.setOnClickListener(null);
    view2131558522 = null;
  }
}
