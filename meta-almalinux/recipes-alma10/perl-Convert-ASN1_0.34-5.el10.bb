
PN = "perl-Convert-ASN1"
PE = "0"
PV = "0.34"
PR = "5.el10"
PACKAGES = "perl-Convert-ASN1 perl-Convert-ASN1-tests"


URI_perl-Convert-ASN1 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Convert-ASN1-0.34-5.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Convert-ASN1 = "
 perl-constant
 perl-libs
 perl-Carp
 perl-vars
 perl-Socket
 perl-POSIX
 perl-Encode
 perl-Convert-ASN1
 perl-Exporter
 perl-Time-Local
"

URI_perl-Convert-ASN1-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Convert-ASN1-tests-0.34-5.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Convert-ASN1-tests = "
 perl-Test-Harness
 perl-Test-Simple
 perl-Math-BigInt
 perl-IO
 perl-POSIX
 perl-Convert-ASN1
 bash
 perl-interpreter
 perl-Data-Dumper
 perl-File-Temp
"
