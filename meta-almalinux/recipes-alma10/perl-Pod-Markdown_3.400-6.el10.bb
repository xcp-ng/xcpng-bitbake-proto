
PN = "perl-Pod-Markdown"
PE = "0"
PV = "3.400"
PR = "6.el10"
PACKAGES = "perl-Pod-Markdown perl-Pod-Markdown-tests"


URI_perl-Pod-Markdown = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Pod-Markdown-3.400-6.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Pod-Markdown = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) /usr/bin/perl ( ) perl(Getopt::Long) ( ) perl(Encode) ( ) perl(parent) ( ) perl(Pod::Usage) ( ) perl(Pod::Markdown) ( ) perl(URI::Escape) ( ) perl(Pod::Simple::Methody) ( ) perl(:VERSION) ( >=  5.8.0) perl(Pod::Simple) ( >=  3.27)"
RPROVIDES:perl-Pod-Markdown = "perl(Pod::Markdown) ( =  3.400) perl(Pod::Perldoc::ToMarkdown) ( =  3.400) perl-Pod-Markdown ( =  3.400-6.el10)"

URI_perl-Pod-Markdown-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Pod-Markdown-tests-3.400-6.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Pod-Markdown-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(File::Spec) ( ) perl(lib) ( ) perl(Exporter) ( ) perl(File::Temp) ( ) perl(utf8) ( ) perl(IO::Handle) ( ) perl(ExtUtils::MakeMaker) ( ) perl(File::Spec::Functions) ( ) perl(Getopt::Long) ( ) perl(Symbol) ( ) perl(IPC::Open3) ( ) perl(Pod::Usage) ( ) perl(Test::Differences) ( ) perl(Pod::Markdown) ( ) perl(Pod::Perldoc::ToMarkdown) ( ) perl(Test::More) ( >=  0.88) perl(:VERSION) ( >=  5.6.0) perl(:VERSION) ( >=  5.8.0) perl-Pod-Markdown ( =  3.400-6.el10)"
RPROVIDES:perl-Pod-Markdown-tests = "perl-Pod-Markdown-tests ( =  3.400-6.el10)"
