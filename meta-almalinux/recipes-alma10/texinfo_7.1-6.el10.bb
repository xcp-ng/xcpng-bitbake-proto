
PN = "texinfo"
PE = "0"
PV = "7.1"
PR = "6.el10"
PACKAGES = "info texinfo texinfo-tex"


URI_info = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/info-7.1-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:info = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /bin/sh ( ) /usr/bin/sh ( ) libtinfo.so.6()(64bit) ( )"
RPROVIDES:info = "/sbin/install-info ( ) info ( =  7.1-6.el10) info(x86-64) ( =  7.1-6.el10)"

URI_texinfo = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/texinfo-7.1-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:texinfo = "perl(strict) ( ) perl(warnings) ( ) perl(Exporter) ( ) perl(Carp) ( ) /usr/bin/perl ( ) perl(vars) ( ) perl(Getopt::Long) ( ) perl(File::Spec) ( ) perl(File::Basename) ( ) perl(Config) ( ) perl(Cwd) ( ) perl(POSIX) ( ) perl(Data::Dumper) ( ) perl(Encode) ( ) perl(File::Path) ( ) perl(File::Copy) ( ) perl(DynaLoader) ( ) perl(Symbol) ( ) perl(Storable) ( ) perl(IPC::Open3) ( ) perl(Unicode::EastAsianWidth) ( ) perl(if) ( ) perl(Locale::Messages) ( ) perl(Text::Unidecode) ( ) perl(utf8) ( ) perl(MIME::Base64) ( ) perl(Pod::Simple::PullParser) ( ) perl(Unicode::Normalize) ( ) perl(charnames) ( ) perl(:VERSION) ( >=  5.6.0) perl(:VERSION) ( >=  5.8.0) perl(:VERSION) ( >=  5.8.1) perl(:VERSION) ( >=  5.4.50) perl(:VERSION) ( >=  5.0.0)"
RPROVIDES:texinfo = "texinfo ( =  7.1-6.el10) perl(Pod::Simple::Texinfo) ( =  0.01) perl(Texinfo::Common) ( =  7.1) perl(Texinfo::Convert::Converter) ( =  7.1) perl(Texinfo::Convert::DocBook) ( =  7.1) perl(Texinfo::Convert::HTML) ( =  7.1) perl(Texinfo::Convert::IXIN) ( =  7.1) perl(Texinfo::Convert::IXINSXML) ( =  7.1) perl(Texinfo::Convert::Info) ( =  7.1) perl(Texinfo::Convert::LaTeX) ( =  7.1) perl(Texinfo::Convert::NodeNameNormalization) ( =  7.1) perl(Texinfo::Convert::Paragraph) ( =  7.1) perl(Texinfo::Convert::PlainTexinfo) ( =  7.1) perl(Texinfo::Convert::Plaintext) ( =  7.1) perl(Texinfo::Convert::Texinfo) ( =  7.1) perl(Texinfo::Convert::TexinfoMarkup) ( =  7.1) perl(Texinfo::Convert::TexinfoSXML) ( =  7.1) perl(Texinfo::Convert::TexinfoXML) ( =  7.1) perl(Texinfo::Convert::Text) ( =  7.1) perl(Texinfo::Convert::TextContent) ( =  7.1) perl(Texinfo::Convert::Unicode) ( =  7.1) perl(Texinfo::Convert::Utils) ( =  7.1) perl(Texinfo::MiscXS) ( =  7.1) perl(Texinfo::ModulePath) ( =  6.3) perl(Texinfo::Parser) ( =  7.1) perl(Texinfo::Structuring) ( =  7.1) perl(Texinfo::Transformations) ( =  7.1) perl(Texinfo::XSLoader) ( =  7.1) texinfo(x86-64) ( =  7.1-6.el10)"

URI_texinfo-tex = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/texinfo-tex-7.1-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:texinfo-tex = "/bin/sh ( ) /usr/bin/texconfig-sys ( ) /usr/bin/sh ( ) tex(epsf.tex) ( ) tex(tex) ( ) texinfo ( =  7.1-6.el10)"
RPROVIDES:texinfo-tex = "texlive-texinfo ( ) tex-texinfo ( ) texinfo-tex ( =  7.1-6.el10) texinfo-tex(x86-64) ( =  7.1-6.el10)"
