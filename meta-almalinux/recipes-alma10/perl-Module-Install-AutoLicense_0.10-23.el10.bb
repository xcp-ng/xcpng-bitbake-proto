
inherit dnf-bridge

PN = "perl-Module-Install-AutoLicense"
PE = "0"
PV = "0.10"
PR = "23.el10"
PACKAGES = "perl-Module-Install-AutoLicense"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/perl-Module-Install-AutoLicense-0.10-23.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-Module-Install-AutoLicense = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Module-Install-AutoLicense-0.10-23.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Module-Install-AutoLicense}"
RDEPENDS:perl-Module-Install-AutoLicense = " \
 perl-libs \
 perl-vars \
 perl-Module-Install \
 perl-Software-License \
 perl-base \
"
