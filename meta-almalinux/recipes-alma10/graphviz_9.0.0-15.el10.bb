
PN = "graphviz"
PE = "0"
PV = "9.0.0"
PR = "15.el10"
PACKAGES = "graphviz graphviz-doc graphviz-gd graphviz-python3 graphviz-ruby graphviz-devel graphviz-go graphviz-graphs graphviz-java graphviz-lua graphviz-perl graphviz-tcl"


URI_graphviz = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/graphviz-9.0.0-15.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:graphviz = "
 libtool-ltdl
 pango
 fontconfig
 libX11
 poppler-glib
 urw-base35-fonts
 libXrender
 libstdc++
 cairo
 gd
 zlib-ng-compat
 librsvg2
 libgcc
 libwebp
 gdk-pixbuf2
 libgs
 bash
 expat
 freetype
 harfbuzz
 glib2
 glibc
"

URI_graphviz-doc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/graphviz-doc-9.0.0-15.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:graphviz-doc = ""

URI_graphviz-gd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/graphviz-gd-9.0.0-15.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:graphviz-gd = "
 gd
 zlib-ng-compat
 libtool-ltdl
 harfbuzz
 pango
 cairo
 glib2
 expat
 glibc
 graphviz
"

URI_graphviz-python3 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/graphviz-python3-9.0.0-15.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:graphviz-python3 = "
 python3
 zlib-ng-compat
 libtool-ltdl
 libgcc
 libstdc++
 expat
 glibc
 graphviz
"

URI_graphviz-ruby = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/graphviz-ruby-9.0.0-15.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:graphviz-ruby = "
 zlib-ng-compat
 libtool-ltdl
 libgcc
 ruby
 libstdc++
 ruby-libs
 expat
 glibc
 graphviz
"

URI_graphviz-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/graphviz-devel-9.0.0-15.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:graphviz-devel = "
 graphviz
 graphviz-gd
 pkgconf-pkg-config
"

URI_graphviz-go = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/graphviz-go-9.0.0-15.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:graphviz-go = "
 zlib-ng-compat
 libtool-ltdl
 libgcc
 libstdc++
 expat
 glibc
 graphviz
 golang
"

URI_graphviz-graphs = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/graphviz-graphs-9.0.0-15.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:graphviz-graphs = ""

URI_graphviz-java = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/graphviz-java-9.0.0-15.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:graphviz-java = "
 zlib-ng-compat
 libtool-ltdl
 libgcc
 libstdc++
 expat
 glibc
 graphviz
"

URI_graphviz-lua = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/graphviz-lua-9.0.0-15.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:graphviz-lua = "
 zlib-ng-compat
 libtool-ltdl
 lua-libs
 libgcc
 libstdc++
 lua
 expat
 glibc
 graphviz
"

URI_graphviz-perl = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/graphviz-perl-9.0.0-15.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:graphviz-perl = "
 zlib-ng-compat
 perl-libs
 libtool-ltdl
 libxcrypt
 libgcc
 perl-DynaLoader
 libstdc++
 expat
 glibc
 graphviz
 perl-Exporter
 perl-base
"

URI_graphviz-tcl = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/graphviz-tcl-9.0.0-15.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:graphviz-tcl = "
 gd
 zlib-ng-compat
 libtool-ltdl
 freetype
 libgcc
 harfbuzz
 tk
 pango
 fontconfig
 tcl
 libstdc++
 glib2
 cairo
 expat
 glibc
 graphviz
"
