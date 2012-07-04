import lombok.AccessLevel;
import lombok.BoundSetter;
class BoundPropertySupportVetoable {
  private volatile transient java.beans.PropertyChangeSupport $propertyChangeSupport;
  private final java.lang.Object[] $propertyChangeSupportLock = new java.lang.Object[0];
  private volatile transient java.beans.VetoableChangeSupport $vetoableChangeSupport;
  private final java.lang.Object[] $vetoableChangeSupportLock = new java.lang.Object[0];
  public static final java.lang.String PROP_NAME = "name";
  public static final java.lang.String PROP_SURNAME = "surname";
  private @BoundSetter(vetoable = true) String name;
  private @BoundSetter(throwVetoException = true) String surname;
  <clinit>() {
  }
  private @java.lang.SuppressWarnings("all") java.beans.PropertyChangeSupport getPropertyChangeSupport() {
    if ((this.$propertyChangeSupport == null))
        {
          synchronized (this.$propertyChangeSupportLock)
            {
              if ((this.$propertyChangeSupport == null))
                  {
                    this.$propertyChangeSupport = new java.beans.PropertyChangeSupport(this);
                  }
            }
        }
    return this.$propertyChangeSupport;
  }
  public @java.lang.SuppressWarnings("all") void addPropertyChangeListener(final java.beans.PropertyChangeListener listener) {
    getPropertyChangeSupport().addPropertyChangeListener(listener);
  }
  public @java.lang.SuppressWarnings("all") void removePropertyChangeListener(final java.beans.PropertyChangeListener listener) {
    getPropertyChangeSupport().removePropertyChangeListener(listener);
  }
  private @java.lang.SuppressWarnings("all") java.beans.VetoableChangeSupport getVetoableChangeSupport() {
    if ((this.$vetoableChangeSupport == null))
        {
          synchronized (this.$vetoableChangeSupportLock)
            {
              if ((this.$vetoableChangeSupport == null))
                  {
                    this.$vetoableChangeSupport = new java.beans.VetoableChangeSupport(this);
                  }
            }
        }
    return this.$vetoableChangeSupport;
  }
  public @java.lang.SuppressWarnings("all") void addVetoableChangeListener(final java.beans.VetoableChangeListener listener) {
    getVetoableChangeSupport().addVetoableChangeListener(listener);
  }
  public @java.lang.SuppressWarnings("all") void removeVetoableChangeListener(final java.beans.VetoableChangeListener listener) {
    getVetoableChangeSupport().removeVetoableChangeListener(listener);
  }
  public @java.lang.SuppressWarnings("all") void setName(final String name) {
    final String $old = this.name;
    try 
      {
        getVetoableChangeSupport().fireVetoableChange(PROP_NAME, $old, name);
      }
    catch (final java.beans.PropertyVetoException $e)       {
        return ;
      }
    this.name = name;
    getPropertyChangeSupport().firePropertyChange(PROP_NAME, $old, name);
  }
  public @java.lang.SuppressWarnings("all") void setSurname(final String surname) throws java.beans.PropertyVetoException {
    final String $old = this.surname;
    getVetoableChangeSupport().fireVetoableChange(PROP_SURNAME, $old, surname);
    this.surname = surname;
    getPropertyChangeSupport().firePropertyChange(PROP_SURNAME, $old, surname);
  }
  BoundPropertySupportVetoable() {
    super();
  }
}