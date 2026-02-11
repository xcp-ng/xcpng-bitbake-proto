
inherit dnf-bridge

PN = "lua-posix"
PE = "0"
PV = "36.2.1"
PR = "8.el10"
PACKAGES = "lua-posix"


URI_lua-posix = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/lua-posix-36.2.1-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lua-posix = " \
 glibc \
 libxcrypt \
 lua-libs \
"
