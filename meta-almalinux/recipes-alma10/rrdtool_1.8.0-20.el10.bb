
PN = "rrdtool"
PE = "0"
PV = "1.8.0"
PR = "20.el10"
PACKAGES = "rrdtool rrdtool-perl python3-rrdtool rrdtool-devel rrdtool-doc rrdtool-lua rrdtool-ruby rrdtool-tcl"


URI_rrdtool = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rrdtool-1.8.0-20.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:rrdtool = "
 systemd
 libpng
 harfbuzz
 libxml2
 pango
 bash
 glib2
 cairo
 glibc
 dejavu-sans-mono-fonts
"

URI_rrdtool-perl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rrdtool-perl-1.8.0-20.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:rrdtool-perl = "
 perl-libs
 perl-Carp
 perl-vars
 perl-IO
 perl-Fcntl
 perl-DynaLoader
 perl-IPC-Open3
 glibc
 rrdtool
"

URI_python3-rrdtool = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-rrdtool-1.8.0-20.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-rrdtool = "
 glibc
 rrdtool
 python3
"

URI_rrdtool-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/rrdtool-devel-1.8.0-20.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:rrdtool-devel = "
 rrdtool
 pkgconf-pkg-config
"

URI_rrdtool-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/rrdtool-doc-1.8.0-20.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:rrdtool-doc = ""

URI_rrdtool-lua = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/rrdtool-lua-1.8.0-20.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:rrdtool-lua = "
 libpng
 lua-libs
 harfbuzz
 libxml2
 pango
 cairo
 glib2
 glibc
 rrdtool
"

URI_rrdtool-ruby = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/rrdtool-ruby-1.8.0-20.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:rrdtool-ruby = "
 glibc
 rrdtool
 ruby-libs
"

URI_rrdtool-tcl = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/rrdtool-tcl-1.8.0-20.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:rrdtool-tcl = "
 glibc
 rrdtool
 tcl
"
