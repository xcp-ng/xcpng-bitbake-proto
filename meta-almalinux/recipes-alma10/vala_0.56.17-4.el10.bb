
inherit dnf-bridge

PN = "vala"
PE = "0"
PV = "0.56.17"
PR = "4.el10"
PACKAGES = "libvala libvala-devel vala vala-doc valadoc valadoc-devel"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/vala-0.56.17-4.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libvala = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libvala-0.56.17-4.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libvala}"
RDEPENDS:libvala = " \
 glibc \
 libgcc \
 glib2 \
"

URI_libvala-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libvala-devel-0.56.17-4.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libvala-devel}"
RDEPENDS:libvala-devel = " \
 glib2-devel \
 libvala \
 pkgconf-pkg-config \
"

URI_vala = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/vala-0.56.17-4.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_vala}"
RDEPENDS:vala = " \
 libvala \
 pkgconf-pkg-config \
 bash \
 glib2 \
 gobject-introspection-devel \
 glibc \
"

URI_vala-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/vala-doc-0.56.17-4.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_vala-doc}"
RDEPENDS:vala-doc = " \
 vala \
"

URI_valadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/valadoc-0.56.17-4.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_valadoc}"
RDEPENDS:valadoc = " \
 vala \
 libvala \
 glib2 \
 glibc \
 graphviz \
"

URI_valadoc-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/valadoc-devel-0.56.17-4.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_valadoc-devel}"
RDEPENDS:valadoc-devel = " \
 graphviz-devel \
 glib2-devel \
 valadoc \
 pkgconf-pkg-config \
 libvala-devel \
"
