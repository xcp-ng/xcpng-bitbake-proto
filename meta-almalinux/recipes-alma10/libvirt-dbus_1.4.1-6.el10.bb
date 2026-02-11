
inherit dnf-bridge

PN = "libvirt-dbus"
PE = "0"
PV = "1.4.1"
PR = "6.el10"
PACKAGES = "libvirt-dbus"


URI_libvirt-dbus = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libvirt-dbus-1.4.1-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libvirt-dbus = " \
 shadow-utils \
 libgcc \
 polkit \
 bash \
 glib2 \
 dbus \
 glibc \
 libvirt-glib \
 libvirt-libs \
"
