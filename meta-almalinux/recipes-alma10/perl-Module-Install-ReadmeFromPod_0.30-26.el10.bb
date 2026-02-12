
inherit dnf-bridge

PN = "perl-Module-Install-ReadmeFromPod"
PE = "0"
PV = "0.30"
PR = "26.el10"
PACKAGES = "perl-Module-Install-ReadmeFromPod"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/perl-Module-Install-ReadmeFromPod-0.30-26.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-Module-Install-ReadmeFromPod = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Module-Install-ReadmeFromPod-0.30-26.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Module-Install-ReadmeFromPod}"
RDEPENDS:perl-Module-Install-ReadmeFromPod = " \
 perl-libs \
 perl-vars \
 perl-Module-Install \
 perl-Capture-Tiny \
 perl-Pod-Markdown \
 perl-podlators \
 perl-Pod-Html \
 perl-base \
 perl-IO-All \
"
