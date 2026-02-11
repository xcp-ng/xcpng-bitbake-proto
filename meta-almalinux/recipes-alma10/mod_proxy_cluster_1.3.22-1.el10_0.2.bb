
PN = "mod_proxy_cluster"
PE = "0"
PV = "1.3.22"
PR = "1.el10_0.2"
PACKAGES = "mod_proxy_cluster"


URI_mod_proxy_cluster = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mod_proxy_cluster-1.3.22-1.el10_0.2.x86_64_v2.rpm;unpack=0"
RDEPENDS:mod_proxy_cluster = "/bin/sh ( ) policycoreutils-python-utils ( ) python3-policycoreutils ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) apr-util ( ) apr ( ) httpd ( >=  2.4.6)"
RPROVIDES:mod_proxy_cluster = "mod_proxy_cluster ( =  1.3.22-1.el10_0.2) mod_proxy_cluster(x86-64) ( =  1.3.22-1.el10_0.2)"
