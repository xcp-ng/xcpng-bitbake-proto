
PN = "perl-XML-Parser"
PE = "0"
PV = "2.47"
PR = "6.el10"
PACKAGES = "perl-XML-Parser perl-XML-Parser-tests"


URI_perl-XML-Parser = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-XML-Parser-2.47-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-XML-Parser = "
 perl-libs
 perl-Carp
 perl-libwww-perl
 perl-IO
 perl-URI
 perl-overload
 perl-PathTools
 expat
 glibc
"

URI_perl-XML-Parser-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-XML-Parser-tests-2.47-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-XML-Parser-tests = "
 perl-Test
 perl-Test-Harness
 perl-libs
 perl-Test-Simple
 perl-FileHandle
 perl-IO
 perl-XML-Parser
 bash
 perl-if
 perl-interpreter
"
