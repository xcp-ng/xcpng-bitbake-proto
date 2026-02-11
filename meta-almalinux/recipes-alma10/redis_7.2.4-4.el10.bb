
PN = "redis"
PE = "0"
PV = "7.2.4"
PR = "4.el10"
PACKAGES = "redis redis-devel redis-doc"


URI_redis = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/redis-7.2.4-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:redis = "
 logrotate
 shadow-utils
 systemd
 systemd-libs
 openssl-libs
 bash
 glibc
"

URI_redis-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/redis-devel-7.2.4-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:redis-devel = ""

URI_redis-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/redis-doc-7.2.4-4.el10.noarch.rpm;unpack=0"
RDEPENDS:redis-doc = ""
