
inherit dnf-bridge

PN = "lua-rpm-macros"
PE = "0"
PV = "1"
PR = "15.el10"
PACKAGES = "lua-rpm-macros lua-srpm-macros"


URI_lua-rpm-macros = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/lua-rpm-macros-1-15.el10.noarch.rpm;unpack=0"
RDEPENDS:lua-rpm-macros = " \
 lua-srpm-macros \
"

URI_lua-srpm-macros = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/lua-srpm-macros-1-15.el10.noarch.rpm;unpack=0"
RDEPENDS:lua-srpm-macros = " \
 rpm \
"
