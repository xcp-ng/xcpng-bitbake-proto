
inherit dnf-bridge

PN = "pangomm2.48"
PE = "0"
PV = "2.50.2"
PR = "4.el10"
PACKAGES = "pangomm2.48 pangomm2.48-devel pangomm2.48-doc"


URI_pangomm2.48 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pangomm2.48-2.50.2-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pangomm2.48 = " \
 libgcc \
 pango \
 libstdc++ \
 glib2 \
 glibmm2.68 \
 glibc \
 cairomm1.16 \
 libsigc++30 \
"

URI_pangomm2.48-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/pangomm2.48-devel-2.50.2-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pangomm2.48-devel = " \
 pkgconf-pkg-config \
 pango-devel \
 pangomm2.48 \
 glibmm2.68-devel \
 cairomm1.16-devel \
"

URI_pangomm2.48-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/pangomm2.48-doc-2.50.2-4.el10.noarch.rpm;unpack=0"
RDEPENDS:pangomm2.48-doc = " \
 pangomm2.48 \
 glibmm2.68-doc \
 libsigc++30-doc \
"
