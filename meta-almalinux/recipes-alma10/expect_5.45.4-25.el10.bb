
PN = "expect"
PE = "0"
PV = "5.45.4"
PR = "25.el10"
PACKAGES = "expect expect-devel expectk"


URI_expect = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/expect-5.45.4-25.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:expect = "
 glibc
 bash
 tcl
"

URI_expect-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/expect-devel-5.45.4-25.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:expect-devel = "
 expect
"

URI_expectk = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/expectk-5.45.4-25.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:expectk = "
 expect
 bash
"
