
inherit dnf-bridge

PN = "perl-Parse-PMFile"
PE = "0"
PV = "0.45"
PR = "3.el10"
PACKAGES = "perl-Parse-PMFile perl-Parse-PMFile-tests"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/perl-Parse-PMFile-0.45-3.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-Parse-PMFile = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Parse-PMFile-0.45-3.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Parse-PMFile}"
RDEPENDS:perl-Parse-PMFile = " \
 perl-Safe \
 perl-libs \
 perl-version \
 perl-Dumpvalue \
 perl-PathTools \
 perl-JSON-PP \
"

URI_perl-Parse-PMFile-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Parse-PMFile-tests-0.45-3.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Parse-PMFile-tests}"
RDEPENDS:perl-Parse-PMFile-tests = " \
 perl-Safe \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-Opcode \
 perl-FindBin \
 perl-Parse-PMFile \
 bash \
 perl-interpreter \
 perl-File-Temp \
"
