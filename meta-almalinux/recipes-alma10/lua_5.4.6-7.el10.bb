
PN = "lua"
PE = "0"
PV = "5.4.6"
PR = "7.el10"
PACKAGES = "lua-libs lua lua-devel lua-static"


URI_lua-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/lua-libs-5.4.6-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lua-libs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libm.so.6(GLIBC_2.38)(64bit) ( )"
RPROVIDES:lua-libs = "liblua-5.4.so()(64bit) ( ) lua(abi) ( =  5.4) lua-libs ( =  5.4.6-7.el10) lua-libs(x86-64) ( =  5.4.6-7.el10)"

URI_lua = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/lua-5.4.6-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lua = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libm.so.6(GLIBC_2.38)(64bit) ( ) libreadline.so.8()(64bit) ( ) liblua-5.4.so()(64bit) ( ) lua-libs ( =  5.4.6-7.el10)"
RPROVIDES:lua = "lua ( =  5.4.6-7.el10) lua(x86-64) ( =  5.4.6-7.el10)"

URI_lua-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/lua-devel-5.4.6-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lua-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) lua(x86-64) ( =  5.4.6-7.el10) lua-rpm-macros ( if  rpm-build)"
RPROVIDES:lua-devel = "lua-devel ( =  5.4.6-7.el10) lua-devel(x86-64) ( =  5.4.6-7.el10) pkgconfig(lua) ( =  5.4.0)"

URI_lua-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/lua-static-5.4.6-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lua-static = "lua(x86-64) ( =  5.4.6-7.el10)"
RPROVIDES:lua-static = "lua-static ( =  5.4.6-7.el10) lua-static(x86-64) ( =  5.4.6-7.el10)"
