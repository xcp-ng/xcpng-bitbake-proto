
inherit dnf-bridge

PN = "perl-GSSAPI"
PE = "0"
PV = "0.28"
PR = "48.el10"
PACKAGES = "perl-GSSAPI"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/perl-GSSAPI-0.28-48.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-GSSAPI = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-GSSAPI-0.28-48.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_perl-GSSAPI}"
RDEPENDS:perl-GSSAPI = " \
 perl-constant \
 perl-libs \
 perl-Carp \
 krb5-libs \
 perl-overload \
 glibc \
 perl-Exporter \
"
