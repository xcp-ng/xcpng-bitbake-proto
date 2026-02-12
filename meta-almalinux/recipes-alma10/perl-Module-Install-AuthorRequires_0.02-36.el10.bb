
inherit dnf-bridge

PN = "perl-Module-Install-AuthorRequires"
PE = "0"
PV = "0.02"
PR = "36.el10"
PACKAGES = "perl-Module-Install-AuthorRequires perl-Module-Install-AuthorRequires-tests"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/perl-Module-Install-AuthorRequires-0.02-36.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-Module-Install-AuthorRequires = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Module-Install-AuthorRequires-0.02-36.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Module-Install-AuthorRequires}"
RDEPENDS:perl-Module-Install-AuthorRequires = " \
 perl-Module-Install \
 perl-libs \
 perl-base \
"

URI_perl-Module-Install-AuthorRequires-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Module-Install-AuthorRequires-tests-0.02-36.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Module-Install-AuthorRequires-tests}"
RDEPENDS:perl-Module-Install-AuthorRequires-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 bash \
 perl-interpreter \
 perl-Module-Install-AuthorRequires \
"
