
inherit dnf-bridge

PN = "editorconfig"
PE = "0"
PV = "0.12.9"
PR = "3.el10"
PACKAGES = "editorconfig-libs editorconfig editorconfig-devel"


URI_editorconfig-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/editorconfig-libs-0.12.9-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:editorconfig-libs = " \
 glibc \
 pcre2 \
"

URI_editorconfig = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/editorconfig-0.12.9-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:editorconfig = " \
 glibc \
 editorconfig-libs \
"

URI_editorconfig-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/editorconfig-devel-0.12.9-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:editorconfig-devel = " \
 editorconfig-libs \
 cmake-filesystem \
 pkgconf-pkg-config \
 cmake \
"
