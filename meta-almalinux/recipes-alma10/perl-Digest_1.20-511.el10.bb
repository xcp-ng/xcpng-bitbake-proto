
PN = "perl-Digest"
PE = "0"
PV = "1.20"
PR = "511.el10"
PACKAGES = "perl-Digest perl-Digest-tests"


URI_perl-Digest = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Digest-1.20-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Digest = "
 perl-libs
 perl-Carp
 perl-Digest
 perl-Exporter
 perl-MIME-Base64
"

URI_perl-Digest-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Digest-tests-1.20-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Digest-tests = "
 perl-Test-Harness
 perl-libs
 perl-Test-Simple
 perl-Digest
 perl-File-Temp
 bash
 perl-interpreter
 perl-lib
"
