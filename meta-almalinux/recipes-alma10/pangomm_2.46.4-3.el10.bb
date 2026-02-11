
PN = "pangomm"
PE = "0"
PV = "2.46.4"
PR = "3.el10"
PACKAGES = "pangomm pangomm-devel pangomm-doc"


URI_pangomm = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/pangomm-2.46.4-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pangomm = " \
 cairomm \
 libgcc \
 pango \
 libsigc++20 \
 libstdc++ \
 glib2 \
 glibc \
 glibmm2.4 \
"

URI_pangomm-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/pangomm-devel-2.46.4-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pangomm-devel = " \
 cairomm-devel \
 pangomm \
 pkgconf-pkg-config \
 pango-devel \
 glibmm2.4-devel \
"

URI_pangomm-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/pangomm-doc-2.46.4-3.el10.noarch.rpm;unpack=0"
RDEPENDS:pangomm-doc = " \
 libsigc++20-doc \
 pangomm \
 glibmm2.4-doc \
"
