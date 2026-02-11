
PN = "perl-IO-Compress-Lzma"
PE = "0"
PV = "2.206"
PR = "7.el10"
PACKAGES = "perl-IO-Compress-Lzma perl-IO-Compress-Lzma-tests"


URI_perl-IO-Compress-Lzma = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-IO-Compress-Lzma-2.206-7.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-IO-Compress-Lzma = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Exporter) ( ) perl(constant) ( ) perl(bytes) ( ) perl(Compress::Raw::Lzma) ( >=  2.206) perl(Compress::Raw::Zlib) ( >=  2.206) perl(IO::Compress::Adapter::Lzip) ( >=  2.206) perl(IO::Compress::Adapter::Lzma) ( >=  2.206) perl(IO::Compress::Adapter::Xz) ( >=  2.206) perl(IO::Compress::Base) ( >=  2.206) perl(IO::Compress::Base::Common) ( >=  2.206) perl(IO::Uncompress::Adapter::UnLzip) ( >=  2.206) perl(IO::Uncompress::Adapter::UnLzma) ( >=  2.206) perl(IO::Uncompress::Adapter::UnXz) ( >=  2.206) perl(IO::Uncompress::Base) ( >=  2.206)"
RPROVIDES:perl-IO-Compress-Lzma = "perl(IO::Compress::Adapter::Lzip) ( =  2.206) perl(IO::Compress::Adapter::Lzma) ( =  2.206) perl(IO::Compress::Adapter::Xz) ( =  2.206) perl(IO::Compress::Lzip) ( =  2.206) perl(IO::Compress::Lzma) ( =  2.206) perl(IO::Compress::Xz) ( =  2.206) perl(IO::Uncompress::Adapter::UnLzip) ( =  2.206) perl(IO::Uncompress::Adapter::UnLzma) ( =  2.206) perl(IO::Uncompress::Adapter::UnXz) ( =  2.206) perl(IO::Uncompress::UnLzip) ( =  2.206) perl(IO::Uncompress::UnLzma) ( =  2.206) perl(IO::Uncompress::UnXz) ( =  2.206) perl-IO-Compress-Lzma ( =  2.206-7.el10)"

URI_perl-IO-Compress-Lzma-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-IO-Compress-Lzma-tests-2.206-7.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-IO-Compress-Lzma-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(File::Spec) ( ) perl(lib) ( ) perl(Config) ( ) perl(Carp) ( ) perl(IO::Handle) ( ) perl(File::Path) ( ) perl(bytes) ( ) perl(List::Util) ( ) perl(IO::String) ( ) perl(IO::Uncompress::AnyUncompress) ( ) perl(IO::Compress::Lzip) ( ) perl(IO::Compress::Lzma) ( ) perl(IO::Compress::Xz) ( ) perl(IO::Uncompress::UnLzip) ( ) perl(IO::Uncompress::UnLzma) ( ) perl(IO::Uncompress::UnXz) ( ) perl(Compress::Raw::Zlib) ( >=  2) perl-IO-Compress-Lzma ( =  2.206-7.el10)"
RPROVIDES:perl-IO-Compress-Lzma-tests = "perl-IO-Compress-Lzma-tests ( =  2.206-7.el10)"
