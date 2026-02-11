
PN = "jq"
PE = "0"
PV = "1.7.1"
PR = "8.el10_0.1"
PACKAGES = "jq jq-devel"


URI_jq = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/jq-1.7.1-8.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:jq = "
 glibc
 oniguruma
"

URI_jq-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jq-devel-1.7.1-8.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:jq-devel = "
 jq
 pkgconf-pkg-config
"
