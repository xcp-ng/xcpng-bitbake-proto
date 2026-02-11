
PN = "glibmm2.68"
PE = "0"
PV = "2.78.1"
PR = "5.el10"
PACKAGES = "glibmm2.68 glibmm2.68-devel glibmm2.68-doc"


URI_glibmm2.68 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/glibmm2.68-2.78.1-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:glibmm2.68 = " \
 libgcc \
 libstdc++ \
 glib2 \
 glibc \
 libsigc++30 \
"

URI_glibmm2.68-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/glibmm2.68-devel-2.78.1-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:glibmm2.68-devel = " \
 perl-constant \
 glib2-devel \
 perl-libs \
 libsigc++30-devel \
 perl-interpreter \
 pkgconf-pkg-config \
 perl-open \
 glibmm2.68-devel \
 perl-XML-Parser \
 glibmm2.68 \
 perl-Exporter \
"

URI_glibmm2.68-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/glibmm2.68-doc-2.78.1-5.el10.noarch.rpm;unpack=0"
RDEPENDS:glibmm2.68-doc = " \
 libsigc++30-doc \
 glibmm2.68 \
"
