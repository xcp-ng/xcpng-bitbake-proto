
inherit dnf-bridge

PN = "gcr3"
PE = "0"
PV = "3.41.1"
PR = "10.el10"
PACKAGES = "gcr3 gcr3-base gcr3-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/gcr3-3.41.1-10.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_gcr3 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gcr3-3.41.1-10.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_gcr3}"
RDEPENDS:gcr3 = " \
 gcr3-base \
 openssh-clients \
 pango \
 gdk-pixbuf2 \
 cairo \
 glib2 \
 gtk3 \
 glibc \
"

URI_gcr3-base = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gcr3-base-3.41.1-10.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_gcr3-base}"
RDEPENDS:gcr3-base = " \
 glibc \
 libgcrypt \
 glib2 \
 p11-kit \
"

URI_gcr3-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/gcr3-devel-3.41.1-10.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_gcr3-devel}"
RDEPENDS:gcr3-devel = " \
 gcr3 \
 gcr3-base \
 p11-kit-devel \
 glib2-devel \
 pkgconf-pkg-config \
 gcr3-devel \
 gtk3-devel \
"
