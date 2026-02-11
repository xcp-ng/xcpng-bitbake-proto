
PN = "mod_md"
PE = "1"
PV = "2.4.26"
PR = "3.el10"
PACKAGES = "mod_md"


URI_mod_md = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mod_md-2.4.26-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mod_md = " \
 httpd-core \
 jansson \
 openssl-libs \
 apr \
 apr-util \
 libcurl \
 glibc \
 mod_ssl \
"
