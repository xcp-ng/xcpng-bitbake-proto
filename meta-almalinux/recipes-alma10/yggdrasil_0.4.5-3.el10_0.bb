
PN = "yggdrasil"
PE = "0"
PV = "0.4.5"
PR = "3.el10_0"
PACKAGES = "yggdrasil yggdrasil-devel yggdrasil-examples"


URI_yggdrasil = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/yggdrasil-0.4.5-3.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:yggdrasil = "/bin/sh ( ) shadow-utils ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libresolv.so.2()(64bit) ( )"
RPROVIDES:yggdrasil = "group(yggdrasil) ( ) group(yggdrasil-worker) ( ) bundled(golang(gopkg.in/yaml.v3)) ( =  3.0.1) bundled(golang(github.com/google/uuid)) ( =  1.6.0) bundled(golang(github.com/hashicorp/go-multierror)) ( =  1.1.1) bundled(golang(github.com/BurntSushi/toml)) ( =  1.4.0) bundled(golang(github.com/hashicorp/errwrap)) ( =  1.1.0) bundled(golang(github.com/mattn/go-sqlite3)) ( =  1.14.24) bundled(golang(github.com/google/go-cmp)) ( =  0.6.0) bundled(golang(github.com/godbus/dbus/v5)) ( =  5.1.0) bundled(golang(github.com/coreos/go-systemd/v22)) ( =  22.5.0) bundled(golang(github.com/russross/blackfriday/v2)) ( =  2.1.0) bundled(golang(github.com/pelletier/go-toml)) ( =  1.9.5) bundled(golang(git.sr.ht/~spc/go-log)) ( =  0.1.1) bundled(golang(github.com/adrg/xdg)) ( =  0.5.3) bundled(golang(github.com/cpuguy83/go-md2man/v2)) ( =  2.0.5) bundled(golang(github.com/eclipse/paho.mqtt.golang)) ( =  1.5.0) bundled(golang(github.com/golang-migrate/migrate/v4)) ( =  4.17.1) bundled(golang(github.com/gorilla/websocket)) ( =  1.5.3) bundled(golang(github.com/rjeczalik/notify)) ( =  0.9.3) bundled(golang(github.com/urfave/cli/v2)) ( =  2.27.5) bundled(golang(github.com/xrash/smetrics)) ( =  686a1a2) bundled(golang(go.uber.org/atomic)) ( =  1.7.0) bundled(golang(golang.org/x/net)) ( =  0.33.0) bundled(golang(golang.org/x/sync)) ( =  0.7.0) bundled(golang(golang.org/x/sys)) ( =  0.28.0) user(yggdrasil) ( =  dSB5Z2dkcmFzaWwgLSAieWdnZHJhc2lsIHN5c3RlbSB1c2VyIiAvdmFyL2xpYi95Z2dkcmFzaWwgLQAA) user(yggdrasil-worker) ( =  dSB5Z2dkcmFzaWwtd29ya2VyIC0gInlnZ2RyYXNpbCB3b3JrZXIgdXNlciIgLSAt) config(yggdrasil) ( =  0.4.5-3.el10_0) yggdrasil ( =  0.4.5-3.el10_0) yggdrasil(x86-64) ( =  0.4.5-3.el10_0)"

URI_yggdrasil-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/yggdrasil-devel-0.4.5-3.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:yggdrasil-devel = "/usr/bin/pkg-config ( )"
RPROVIDES:yggdrasil-devel = "pkgconfig(yggdrasil) ( =  0.4.5) yggdrasil-devel ( =  0.4.5-3.el10_0) yggdrasil-devel(x86-64) ( =  0.4.5-3.el10_0)"

URI_yggdrasil-examples = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/yggdrasil-examples-0.4.5-3.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:yggdrasil-examples = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libresolv.so.2()(64bit) ( ) yggdrasil ( =  0.4.5-3.el10_0)"
RPROVIDES:yggdrasil-examples = "yggdrasil-examples ( =  0.4.5-3.el10_0) yggdrasil-examples(x86-64) ( =  0.4.5-3.el10_0)"
