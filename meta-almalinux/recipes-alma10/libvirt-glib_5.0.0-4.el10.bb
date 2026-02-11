
inherit dnf-bridge

PN = "libvirt-glib"
PE = "0"
PV = "5.0.0"
PR = "4.el10"
PACKAGES = "libvirt-glib libvirt-gconfig libvirt-gconfig-devel libvirt-glib-devel libvirt-gobject libvirt-gobject-devel"


URI_libvirt-glib = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libvirt-glib-5.0.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libvirt-glib = " \
 glibc \
 libvirt-libs \
 glib2 \
"

URI_libvirt-gconfig = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libvirt-gconfig-5.0.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libvirt-gconfig = " \
 glibc \
 libxml2 \
 glib2 \
"

URI_libvirt-gconfig-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libvirt-gconfig-devel-5.0.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libvirt-gconfig-devel = " \
 libxml2-devel \
 libvirt-gconfig \
 glib2-devel \
 pkgconf-pkg-config \
"

URI_libvirt-glib-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libvirt-glib-devel-5.0.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libvirt-glib-devel = " \
 libvirt-glib \
 glib2-devel \
 pkgconf-pkg-config \
"

URI_libvirt-gobject = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libvirt-gobject-5.0.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libvirt-gobject = " \
 libvirt-gconfig \
 glib2 \
 glibc \
 libvirt-glib \
 libvirt-libs \
"

URI_libvirt-gobject-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libvirt-gobject-devel-5.0.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libvirt-gobject-devel = " \
 glib2-devel \
 pkgconf-pkg-config \
 libvirt-devel \
 libvirt-gconfig-devel \
 libvirt-glib-devel \
 libvirt-gobject \
"
