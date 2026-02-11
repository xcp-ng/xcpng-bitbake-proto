
inherit dnf-bridge

PN = "pygobject3"
PE = "0"
PV = "3.46.0"
PR = "7.el10"
PACKAGES = "python3-gobject-base python3-gobject-base-noarch python3-gobject python3-gobject-devel"


URI_python3-gobject-base = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-gobject-base-3.46.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-gobject-base = " \
 python3 \
 gobject-introspection \
 libffi \
 glib2 \
 python3-gobject-base-noarch \
 glibc \
"

URI_python3-gobject-base-noarch = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-gobject-base-noarch-3.46.0-7.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-gobject-base-noarch = " \
 python3 \
 python3-gobject-base \
"

URI_python3-gobject = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-gobject-3.46.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-gobject = " \
 python3 \
 python3-cairo \
 cairo \
 glib2 \
 cairo-gobject \
 glibc \
 python3-gobject-base \
"

URI_python3-gobject-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-gobject-devel-3.46.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-gobject-devel = " \
 python3-gobject \
 glib2-devel \
 pkgconf-pkg-config \
 gobject-introspection-devel \
 libffi-devel \
"
