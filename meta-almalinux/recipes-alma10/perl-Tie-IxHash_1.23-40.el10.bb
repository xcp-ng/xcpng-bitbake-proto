
inherit dnf-bridge

PN = "perl-Tie-IxHash"
PE = "0"
PV = "1.23"
PR = "40.el10"
PACKAGES = "perl-Tie-IxHash"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/perl-Tie-IxHash-1.23-40.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-Tie-IxHash = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Tie-IxHash-1.23-40.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Tie-IxHash}"
RDEPENDS:perl-Tie-IxHash = " \
 perl-libs \
 perl-vars \
"
