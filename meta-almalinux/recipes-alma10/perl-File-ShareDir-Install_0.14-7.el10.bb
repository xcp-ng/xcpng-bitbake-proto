
inherit dnf-bridge

PN = "perl-File-ShareDir-Install"
PE = "0"
PV = "0.14"
PR = "7.el10"
PACKAGES = "perl-File-ShareDir-Install"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/perl-File-ShareDir-Install-0.14-7.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-File-ShareDir-Install = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-File-ShareDir-Install-0.14-7.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-File-ShareDir-Install}"
RDEPENDS:perl-File-ShareDir-Install = " \
 perl-libs \
 perl-Carp \
 perl-IO \
 perl-PathTools \
 perl-Exporter \
"
