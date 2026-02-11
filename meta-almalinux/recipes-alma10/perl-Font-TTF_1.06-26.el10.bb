
PN = "perl-Font-TTF"
PE = "0"
PV = "1.06"
PR = "26.el10"
PACKAGES = "perl-Font-TTF perl-Font-TTF-XMLparse perl-Font-TTF-tests"


URI_perl-Font-TTF = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Font-TTF-1.06-26.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Font-TTF = "
 perl-libs
 perl-Font-TTF
 perl-vars
 perl-IO
 perl-Symbol
 perl-Exporter
 perl-Data-Dumper
 perl-IO-String
"

URI_perl-Font-TTF-XMLparse = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Font-TTF-XMLparse-1.06-26.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Font-TTF-XMLparse = "
 perl-Exporter
 perl-libs
 perl-XML-Parser
 perl-vars
"

URI_perl-Font-TTF-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Font-TTF-tests-1.06-26.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Font-TTF-tests = "
 perl-Test-Harness
 perl-libs
 perl-Test-Simple
 perl-Font-TTF
 perl-IO-Compress
 perl-File-Compare
 bash
 perl-interpreter
"
