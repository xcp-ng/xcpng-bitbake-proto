
inherit dnf-bridge

PN = "mod_auth_openidc"
PE = "0"
PV = "2.4.15"
PR = "4.el10_0.1"
PACKAGES = "mod_auth_openidc"


URI_mod_auth_openidc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mod_auth_openidc-2.4.15-4.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:mod_auth_openidc = " \
 zlib-ng-compat \
 httpd-core \
 jansson \
 libxcrypt \
 cjose \
 openssl-libs \
 apr \
 jq \
 apr-util \
 pcre2 \
 libcurl \
 glibc \
 expat \
 openldap \
"
