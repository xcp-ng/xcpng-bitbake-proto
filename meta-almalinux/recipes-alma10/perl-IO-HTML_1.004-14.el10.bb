
PN = "perl-IO-HTML"
PE = "0"
PV = "1.004"
PR = "14.el10"
PACKAGES = "perl-IO-HTML perl-IO-HTML-tests"


URI_perl-IO-HTML = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-IO-HTML-1.004-14.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-IO-HTML = "
 perl-Encode
 perl-Exporter
 perl-libs
 perl-Carp
"

URI_perl-IO-HTML-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-IO-HTML-tests-1.004-14.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-IO-HTML-tests = "
 perl-Test-Harness
 perl-libs
 perl-Scalar-List-Utils
 perl-Test-Simple
 perl-IO-HTML
 perl-Encode
 bash
 perl-interpreter
 perl-File-Temp
"
