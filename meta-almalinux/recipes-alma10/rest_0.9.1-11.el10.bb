
inherit dnf-bridge

PN = "rest"
PE = "0"
PV = "0.9.1"
PR = "11.el10"
PACKAGES = "rest rest-devel rest-demo"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/rest-0.9.1-11.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_rest = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rest-0.9.1-11.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_rest}"
RDEPENDS:rest = " \
 libsoup3 \
 libgcc \
 libxml2 \
 json-glib \
 glib2 \
 glibc \
"

URI_rest-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/rest-devel-0.9.1-11.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_rest-devel}"
RDEPENDS:rest-devel = " \
 libxml2-devel \
 rest-devel \
 json-glib-devel \
 glib2-devel \
 libsoup3-devel \
 rest \
 pkgconf-pkg-config \
"

URI_rest-demo = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/rest-demo-0.9.1-11.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_rest-demo}"
RDEPENDS:rest-demo = " \
 libsoup3 \
 libgcc \
 rest \
 json-glib \
 glib2 \
 glibc \
 gtk4 \
 libadwaita \
 gtksourceview5 \
"
