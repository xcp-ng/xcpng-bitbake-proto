
inherit dnf-bridge

PN = "gobject-introspection"
PE = "0"
PV = "1.79.1"
PR = "6.el10"
PACKAGES = "gobject-introspection gobject-introspection-devel"


URI_gobject-introspection = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/gobject-introspection-1.79.1-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gobject-introspection = " \
 glibc \
 libffi \
 glib2 \
"

URI_gobject-introspection-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gobject-introspection-devel-1.79.1-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gobject-introspection-devel = " \
 python3 \
 libtool \
 glib2-devel \
 gobject-introspection \
 libffi \
 pkgconf-pkg-config \
 python3-setuptools \
 python3-markdown \
 glib2 \
 python3-mako \
 gobject-introspection-devel \
 glibc \
"
