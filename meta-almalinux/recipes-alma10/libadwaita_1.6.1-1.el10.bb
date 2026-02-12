
inherit dnf-bridge

PN = "libadwaita"
PE = "0"
PV = "1.6.1"
PR = "1.el10"
PACKAGES = "libadwaita libadwaita-devel libadwaita-doc libadwaita-demo"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libadwaita-1.6.1-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libadwaita = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libadwaita-1.6.1-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libadwaita}"
RDEPENDS:libadwaita = " \
 appstream \
 fribidi \
 pango \
 glib2 \
 graphene \
 glibc \
 gtk4 \
"

URI_libadwaita-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libadwaita-devel-1.6.1-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libadwaita-devel}"
RDEPENDS:libadwaita-devel = " \
 glib2-devel \
 vala \
 fribidi-devel \
 pkgconf-pkg-config \
 appstream-devel \
 libadwaita \
 gtk4-devel \
"

URI_libadwaita-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libadwaita-doc-1.6.1-1.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_libadwaita-doc}"
RDEPENDS:libadwaita-doc = ""

URI_libadwaita-demo = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libadwaita-demo-1.6.1-1.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_libadwaita-demo}"
RDEPENDS:libadwaita-demo = " \
 libadwaita \
"
