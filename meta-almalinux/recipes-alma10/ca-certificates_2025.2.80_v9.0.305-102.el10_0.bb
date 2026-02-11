
PN = "ca-certificates"
PE = "0"
PV = "2025.2.80_v9.0.305"
PR = "102.el10_0"
PACKAGES = "ca-certificates"


URI_ca-certificates = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/ca-certificates-2025.2.80_v9.0.305-102.el10_0.noarch.rpm;unpack=0"
RDEPENDS:ca-certificates = "/bin/sh ( ) coreutils ( ) grep ( ) sed ( ) bash ( ) findutils ( ) libffi ( ) p11-kit-trust ( >=  0.24) /usr/bin/sh ( )"
RPROVIDES:ca-certificates = "ca-certificates ( =  2025.2.80_v9.0.305-102.el10_0) config(ca-certificates) ( =  2025.2.80_v9.0.305-102.el10_0)"
