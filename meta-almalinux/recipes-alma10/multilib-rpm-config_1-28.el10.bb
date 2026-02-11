
PN = "multilib-rpm-config"
PE = "0"
PV = "1"
PR = "28.el10"
PACKAGES = "multilib-rpm-config"


URI_multilib-rpm-config = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/multilib-rpm-config-1-28.el10.noarch.rpm;unpack=0"
RDEPENDS:multilib-rpm-config = "/usr/bin/sh ( ) redhat-rpm-config ( )"
RPROVIDES:multilib-rpm-config = "rpm_macro(multilib_capable) ( ) rpm_macro(multilib_fix_c_header) ( ) multilib-rpm-config ( =  1-28.el10)"
