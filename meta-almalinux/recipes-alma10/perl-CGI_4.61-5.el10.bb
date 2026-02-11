
PN = "perl-CGI"
PE = "0"
PV = "4.61"
PR = "5.el10"
PACKAGES = "perl-CGI perl-CGI-tests"


URI_perl-CGI = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-CGI-4.61-5.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-CGI = "
 perl-libs
 perl-Carp
 perl-Text-ParseWords
 perl-overload
 perl-PathTools
 perl-parent
 perl-HTML-Parser
 perl-Exporter
 perl-CGI
 perl-File-Temp
"

URI_perl-CGI-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-CGI-tests-4.61-5.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-CGI-tests = "
 perl-Test-Warn
 perl-Test-Harness
 perl-libs
 perl-Test-Simple
 perl-FileHandle
 perl-IO
 perl-FindBin
 perl-POSIX
 perl-Encode
 perl-overload
 bash
 perl-PathTools
 perl-interpreter
 perl-CGI
 perl-lib
"
