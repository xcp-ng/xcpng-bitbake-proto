
PN = "ibus-table"
PE = "0"
PV = "1.17.6"
PR = "3.el10"
PACKAGES = "ibus-table ibus-table-devel ibus-table-tests"


URI_ibus-table = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ibus-table-1.17.6-3.el10.noarch.rpm;unpack=0"
RDEPENDS:ibus-table = " \
 python3 \
 ibus \
 bash \
"

URI_ibus-table-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ibus-table-devel-1.17.6-3.el10.noarch.rpm;unpack=0"
RDEPENDS:ibus-table-devel = " \
 ibus-table \
 pkgconf-pkg-config \
"

URI_ibus-table-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ibus-table-tests-1.17.6-3.el10.noarch.rpm;unpack=0"
RDEPENDS:ibus-table-tests = " \
 python3 \
 ibus-table \
"
