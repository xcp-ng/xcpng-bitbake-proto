
PN = "lua"
PE = "0"
PV = "5.4.6"
PR = "7.el10"
PACKAGES = "lua-libs lua lua-devel lua-static"


URI_lua-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/lua-libs-5.4.6-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lua-libs = "
 glibc
"

URI_lua = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/lua-5.4.6-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lua = "
 glibc
 readline
 lua-libs
"

URI_lua-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/lua-devel-5.4.6-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lua-devel = "
 lua
 pkgconf-pkg-config
 lua-rpm-macros
"

URI_lua-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/lua-static-5.4.6-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lua-static = "
 lua
"
