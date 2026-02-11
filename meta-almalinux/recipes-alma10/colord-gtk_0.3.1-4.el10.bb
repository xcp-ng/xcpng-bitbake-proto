
inherit dnf-bridge

PN = "colord-gtk"
PE = "0"
PV = "0.3.1"
PR = "4.el10"
PACKAGES = "colord-gtk colord-gtk4 colord-gtk-devel colord-gtk4-devel"


URI_colord-gtk = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/colord-gtk-0.3.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:colord-gtk = " \
 cairo \
 colord-libs \
 glib2 \
 glibc \
 gtk3 \
"

URI_colord-gtk4 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/colord-gtk4-0.3.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:colord-gtk4 = " \
 cairo \
 glib2 \
 colord-libs \
 glibc \
 gtk4 \
"

URI_colord-gtk-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/colord-gtk-devel-0.3.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:colord-gtk-devel = " \
 colord-devel \
 colord-gtk \
 pkgconf-pkg-config \
 gtk3-devel \
"

URI_colord-gtk4-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/colord-gtk4-devel-0.3.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:colord-gtk4-devel = " \
 colord-devel \
 colord-gtk-devel \
 pkgconf-pkg-config \
 colord-gtk4 \
 gtk4-devel \
"
