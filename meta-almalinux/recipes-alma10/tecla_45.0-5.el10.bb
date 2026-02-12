
inherit dnf-bridge

PN = "tecla"
PE = "0"
PV = "45.0"
PR = "5.el10"
PACKAGES = "tecla tecla-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/tecla-45.0-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_tecla = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tecla-45.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_tecla}"
RDEPENDS:tecla = " \
 libwayland-client \
 libgcc \
 pango \
 glib2 \
 glibc \
 libxkbcommon \
 gtk4 \
 libadwaita \
"

URI_tecla-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/tecla-devel-45.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_tecla-devel}"
RDEPENDS:tecla-devel = " \
 pkgconf-pkg-config \
 tecla \
"
