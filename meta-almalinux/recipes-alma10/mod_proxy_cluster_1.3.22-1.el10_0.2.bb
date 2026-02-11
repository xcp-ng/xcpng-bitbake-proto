
PN = "mod_proxy_cluster"
PE = "0"
PV = "1.3.22"
PR = "1.el10_0.2"
PACKAGES = "mod_proxy_cluster"


URI_mod_proxy_cluster = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mod_proxy_cluster-1.3.22-1.el10_0.2.x86_64_v2.rpm;unpack=0"
RDEPENDS:mod_proxy_cluster = "
 python3-policycoreutils
 httpd
 policycoreutils-python-utils
 apr
 apr-util
 bash
 glibc
"
