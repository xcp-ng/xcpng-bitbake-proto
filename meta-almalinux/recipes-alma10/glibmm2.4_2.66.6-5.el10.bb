
inherit dnf-bridge

PN = "glibmm2.4"
PE = "0"
PV = "2.66.6"
PR = "5.el10"
PACKAGES = "glibmm2.4 glibmm2.4-devel glibmm2.4-doc"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/glibmm2.4-2.66.6-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_glibmm2.4 = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/glibmm2.4-2.66.6-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_glibmm2.4}"
RDEPENDS:glibmm2.4 = " \
 libgcc \
 libsigc++20 \
 libstdc++ \
 glib2 \
 glibc \
"

URI_glibmm2.4-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/glibmm2.4-devel-2.66.6-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_glibmm2.4-devel}"
RDEPENDS:glibmm2.4-devel = " \
 perl-constant \
 glib2-devel \
 perl-libs \
 glibmm2.4 \
 pkgconf-pkg-config \
 perl-open \
 perl-XML-Parser \
 libsigc++20-devel \
 perl-interpreter \
 perl-Exporter \
 glibmm2.4-devel \
"

URI_glibmm2.4-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/glibmm2.4-doc-2.66.6-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_glibmm2.4-doc}"
RDEPENDS:glibmm2.4-doc = " \
 libsigc++20-doc \
 glibmm2.4 \
"
