
PN = "perl-MIME-Charset"
PE = "0"
PV = "1.013.1"
PR = "8.el10"
PACKAGES = "perl-MIME-Charset perl-MIME-Charset-tests"


URI_perl-MIME-Charset = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-MIME-Charset-1.013.1-8.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-MIME-Charset = "
 perl-constant
 perl-libs
 perl-Carp
 perl-vars
 perl-Encode
 perl-Exporter
"

URI_perl-MIME-Charset-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-MIME-Charset-tests-1.013.1-8.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-MIME-Charset-tests = "
 perl-MIME-Charset
 perl-Test
 perl-Test-Harness
 perl-libs
 perl-Test-Simple
 bash
 perl-interpreter
"
