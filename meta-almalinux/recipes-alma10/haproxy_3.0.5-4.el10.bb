
PN = "haproxy"
PE = "0"
PV = "3.0.5"
PR = "4.el10"
PACKAGES = "haproxy"


URI_haproxy = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/haproxy-3.0.5-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:haproxy = "
 shadow-utils
 systemd
 lua-libs
 libxcrypt
 openssl-libs
 bash
 pcre2
 glibc
"
