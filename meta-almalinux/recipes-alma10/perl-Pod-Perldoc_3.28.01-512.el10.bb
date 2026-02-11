
PN = "perl-Pod-Perldoc"
PE = "0"
PV = "3.28.01"
PR = "512.el10"
PACKAGES = "perl-Pod-Perldoc perl-Pod-Perldoc-tests"


URI_perl-Pod-Perldoc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Pod-Perldoc-3.28.01-512.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Pod-Perldoc = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Carp) ( ) /usr/bin/perl ( ) perl(vars) ( ) perl(Config) ( ) perl(File::Basename) ( ) perl(Fcntl) ( ) perl(Encode) ( ) perl(Symbol) ( ) perl(IO::Handle) ( ) perl(parent) ( ) perl(Text::ParseWords) ( ) perl(File::Spec::Functions) ( ) perl(IO::Select) ( ) perl(IPC::Open3) ( ) perl(HTTP::Tiny) ( ) perl(Pod::Text) ( ) perl(Pod::Perldoc) ( ) groff-base ( ) perl(Pod::Perldoc::BaseTo) ( ) perl(Pod::Perldoc::GetOptsOO) ( ) perl(Pod::Simple::Checker) ( ) perl(Pod::Text::Color) ( ) perl(Pod::Text::Termcap) ( ) perl(:VERSION) ( >=  5.6.0) perl(:VERSION) ( >=  5.0.0) perl(File::Temp) ( >=  0.22) perl(Pod::Man) ( >=  2.18) perl(Pod::Simple::RTF) ( >=  3.16) perl(Pod::Simple::XMLOutStream) ( >=  3.16)"
RPROVIDES:perl-Pod-Perldoc = "perl(Pod::Perldoc) ( =  3.2801) perl(Pod::Perldoc::BaseTo) ( =  3.28) perl(Pod::Perldoc::GetOptsOO) ( =  3.28) perl(Pod::Perldoc::ToANSI) ( =  3.28) perl(Pod::Perldoc::ToChecker) ( =  3.28) perl(Pod::Perldoc::ToMan) ( =  3.28) perl(Pod::Perldoc::ToNroff) ( =  3.28) perl(Pod::Perldoc::ToPod) ( =  3.28) perl(Pod::Perldoc::ToRtf) ( =  3.28) perl(Pod::Perldoc::ToTerm) ( =  3.28) perl(Pod::Perldoc::ToText) ( =  3.28) perl(Pod::Perldoc::ToTk) ( =  3.28) perl(Pod::Perldoc::ToXml) ( =  3.28) perl-Pod-Perldoc ( =  3.28.01-512.el10)"

URI_perl-Pod-Perldoc-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Pod-Perldoc-tests-3.28.01-512.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Pod-Perldoc-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(vars) ( ) perl(parent) ( ) perl(Pod::Perldoc::ToMan) ( ) perl-Pod-Perldoc ( =  3.28.01-512.el10)"
RPROVIDES:perl-Pod-Perldoc-tests = "perl-Pod-Perldoc-tests ( =  3.28.01-512.el10)"
